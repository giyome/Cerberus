#!/bin/bash

# This is script is to kill old processes of firefox that sometimes, selenium does not manage to kill.
# This is to avoid overloading the server hosting the selenium server by pilling the firefox process.

# Log File.
export MYLOG=/home/cerberus/tmp/killfirefox.`date +%y%m`.log

# getting the list of old processes that will be killed nicely later and others even older that will be killed in a more brutal way.
export proclist=`ps -eo pid,fname,etime | grep firefox | awk '$3 >= "30:00" {print $1}'`
export proclistold=`ps -eo pid,fname,etime | grep firefox | awk '$3 >= "45:00" {print $1}'`

# logging the nb of processes and correspondig list.
echo `date +%y%m%d-%H%M%S` `echo $proclist | wc -w` `echo $proclistold | wc -w` - `echo $proclist` - `echo $proclistold` >> $MYLOG

# Killing the old processes
if [ "$proclist" != "" ]
  then
    kill $proclist
fi

# Killing in a brutal way the processes that could not be killed in a normal way before.
if [ "$proclistold" != "" ]
  then
    kill -9 $proclistold
fi
