#!/bin/sh

GO_VERSION=1.22
PYTHON_VERSION=3.12

# brew upgrade allure go 

go mod edit --go="${GO_VERSION}"
go mod tidy

npm update
npm audit fix
npm audit fix --force

pipenv install --python="${PYTHON_VERSION}"
