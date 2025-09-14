#!/bin/bash

echo "❌ Request con input inválido (string en lugar de número)"
curl -i "http://localhost:8080/orders?id=abc"
