#!/bin/sh

rm -f src/test/test.csproj
rm -f src/test/Class1.cs
rm -f src/main/main.csproj
rm -f src/main/Class1.cs
rm -f testLeCo.sln

dotnet new sln --name testLeCo
dotnet new classlib --name main --framework net7.0 --output src/main
dotnet new classlib --name test --framework net7.0 --output src/test
dotnet sln add src/main/main.csproj
dotnet sln add src/test/test.csproj
dotnet add src/test/test.csproj reference src/main/main.csproj

rm -f src/test/Class1.cs
rm -f src/main/Class1.cs

dotnet add src/test package Microsoft.NET.Test.Sdk
dotnet add src/test package MSTest.TestFramework
dotnet add src/test package MSTest.TestAdapter
dotnet add src/test package xunit
dotnet add src/test package xunit.runner.visualstudio
dotnet add src/test package Allure.XUnit
dotnet add src/test package coverlet.collector
dotnet add src/test package NUnit
dotnet add src/test package NUnit3TestAdapter
dotnet add src/test package NUnit.Allure
dotnet add src/test package NUnit.Allure.Steps
dotnet add src/test package Allure.Commons
