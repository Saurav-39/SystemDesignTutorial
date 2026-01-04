Write-Host "Cleaning old compiled files......"

Get-ChildItem -Recurse -Filter *.class | Remove-Item -Force -ErrorAction SilentlyContinue

Write-Host "Compiling project..."

javac Client_Person\*.java `
    Document_Class\*.java `
    Editors\*.java `
    Persistence_elements\*.java `
    Document_Element_type\*.java

if($LASTEXITCODE -ne 0)
{
    Write-Host "Compilation failed"
    exit 1
}

Write-Host "Running Cliemt..."
java Client_Person.Client