@echo off
set DIRNAME=%~dp0
set CP="%DIRNAME%chromispos.jar"

echo Starting Zunga Electronica POS...
echo If you see an error below, copy it and share it.
echo.

java -cp %CP% -Ddirname.path="%DIRNAME%" uk.chromis.pos.forms.StartPOS

echo.
echo App exited. Press any key to close.
pause
