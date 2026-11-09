@echo off
cd /d "%~dp0"

echo Starting Zunga Electronica POS...
echo If you see an error below, copy it and share it.
echo.

java -cp chromispos.jar -Ddirname.path=. uk.chromis.pos.forms.StartPOS

echo.
echo App exited. Press any key to close.
pause
