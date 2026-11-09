@echo off
cd /d "%~dp0"

echo === Zunga Electronica POS Diagnostics ===
echo Current directory: %CD%
echo.
echo Checking chromispos.jar...
if not exist chromispos.jar (
    echo ERROR: chromispos.jar not found in %CD%
    pause
    exit /b 1
)
echo OK - found chromispos.jar
echo.
echo Java version:
java -version
echo.
echo Verifying JAR contents...
jar tf chromispos.jar | findstr /i "StartPOS.class"
echo.
echo Starting application...
java -cp chromispos.jar -Ddirname.path=. uk.chromis.pos.forms.StartPOS

echo.
echo App exited. Press any key to close.
pause
