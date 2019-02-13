#!/usr/bin/ksh
# ==================================================================================================
# @file             InterestCalculationBatch.sh
#
# @dep-program
#
# @dep-infile
# @dep-outfile
#
# @usage
#
# @history
#    VERSION : NAME     : DATE     : BASED ON        : HISTORY DATA
#    -------   --------   --------   ---------------   -------------------------------------------
#    VER1.00 : FRAME    :          :                 : SHELL Template
#
# ==================================================================================================
# **************************************** env definition ******************************************
# ------------------------------------------------------------------------------------------------ #
#  Define to Job Info : (Application Location, Application Name, Job ID)
# ------------------------------------------------------------------------------------------------ #
APPLICATION_LOCATION=$BAT_APP_HOME/KDBPOCBatch
APPLICATION_NAME=KDBPOCBatch
BAT_CODE=InterestCalculationBatch

# ----------------------------------------------------------------------------------------------- #
#  Define to Execute Environment : Define Directories and Team/Subteam Directories
# ----------------------------------------------------------------------------------------------- #
. $BAT_HOME/shl/bxmshllog

export SHELLNM=`basename $0`
export BATEXECDATE=`date +%Y%m%d%H%M%S`
export BATLOGFILE="${BAT_LOG_DIR}/${BAT_CODE}_G_${BATEXECDATE}.log"

# ----------------------------------------------------------------------------------------------- #
#  Define Shell Version
# ----------------------------------------------------------------------------------------------- #
BXM_SHL_VER=VER1

# ----------------------------------------------------------------------------------------------- #
#  Define Parameters for Batch Input (Only for Job Scheduler)
# ----------------------------------------------------------------------------------------------- #
# Example
#START_DATE="startDate=$1"        # Start Date (YYYYMMDD)
#END_DATE="endDate=$2"            # End Date (YYYYMMDD)
#START_BRN="startBrn=$3"          # Start Branch Office Number
#END_BRN="endBrn=$4"              # End Branch Office Number

EPARAM="eParam=$1"
FNAME="fName=$2"
TEMPKEY="tempKey=$3"

# ----------------------------------------------------------------------------------------------- #
#  Define Data File Name for Using by Batch Process
# ----------------------------------------------------------------------------------------------- #
INPUT_DATA_FILE=
OUTPUT_DATA_FILE=

# ----------------------------------------------------------------------------------------------- #
#  Define Shell Logging for Batch Start
# ----------------------------------------------------------------------------------------------- #
BXM_HSTDSP "########################################"
BXM_HSTDSP "#>>    Process          START!!!"
BXM_HSTDSP "#>>    Process Name  :  InterestCalculationBatch.sh"
BXM_HSTDSP "########################################"

# ----------- Checking Number of Input Argumnets ---------#

# ------------- Checking INPUT_DATA_FILE --------------#
# BXM_CHECK_FILE errchk=y $INPUT_DATA_FILE

# ************************************* execute (sql/program) *************************************
# ----------------------------------------------------------------------------------------------- #
# Handling Exception (when error occurs during batch execution, go to BXM_CATCH function)
# ----------------------------------------------------------------------------------------------- #
BXM_CATCH()
{
    # Process Result(Error) Return to Control-M
    BXM_BAT_END
}

# ----------------------------------------------------------------------------------------------- #
#  Execute Batch
# ----------------------------------------------------------------------------------------------- #

BXM_BAT_INIT

BXM_TRY $APPLICATION_LOCATION $APPLICATION_NAME $BAT_CODE $EPARAM $FNAME $TEMPKEY

# BXM_CMD Example
# BXM_CMD errchk=y cp $FILE_O $SHBFTP/$TEAMDIR/snd

# ----------------------------------------------------------------------------------------------- #
# Process Result Return to Control-M
# ----------------------------------------------------------------------------------------------- #
BXM_BAT_END
# =====================================  END OF FILE  =========================================== #

