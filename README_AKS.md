# Developer Guide

## Setup
1. Used Java version 8 instead of 11.
2. added h2database and JPA dependencies in pom.xml

## API's
To populate the database with the values I have provided and API which is a POST call at -
    '/api/create/currencyRates' with payload as attached named payload_create1.json and 
    payload_create2.json files.
1. UserStory 1: As a client, I want to get a list of all available currencies -
    '/api/currencies'
2. UserStory 2: As a client, I want to get all EUR-FX exchange rates at all available dates as a 
collection -
    '/api/currencies/range/{conversionEndDate}/{fx}'
3. UserStory 3: As a client, I want to get the EUR-FX exchange rate at particular day -
    '/api/currencies/{conversionDate}/{fx}'
4. UserStory 4: As a client, I want to get a foreign exchange amount for a given currency 
converted to EUR on a particular day -
    '/api/currencies/{conversionDate}/{fx}/{amountInFx}'