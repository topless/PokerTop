#!/bin/bash
FILES=`/bin/ls | grep "\_Informal.bon$"`
bonc -i -p HTML -po informal.html System.bon $FILES  
mv informal.html ~/Desktop/
#google-chrome ~/Desktop/informal.html
