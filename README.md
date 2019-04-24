# ConvertGetter
Write a function that will convert a ‘getter’ method name in camelCase form into a user-friendly field
name.

## Requirements
sbt

# Usage
ConvertGetter can handle conversions of input strings to output strings such as the following examples:

# Input String	    # Output String
  getCurrency         Currency
  getAccountName      Account_Name
  getLongAccountName  Long_Account_Name
  getTradeID          Trade_ID
  getSWIFTCode        SWIFT_Code
  getCurrencyVALUE    Currency_VALUE

Note: ConvertGetter only has to handle method names that start with ‘get’ and exclusively contain letters, i.e. no digit characters, etc.

## How to run program with arguments
`sbt "run getCurrency"`

`sbt "run getCurrency getAccountName getLongAccountName getTradeID getSWIFTCode"`

## Run unit test
`sbt test`
