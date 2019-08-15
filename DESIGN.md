# Chronus Design

### Database

#### Source
Represents where the data source is coming from

* **name** - Name of the source
* **token** - The token to identify the source

#### Stream
A single stream of data coming in.
* **source** - The source of the data.
* **name** - Name of the stream
* **type** - The type of data
  * log
  * performance
  * storage
  

#### Log
Intended to hold log data as it's coming in live

Columns
* **stream** - The stream that the log came from
* **msg** - The original log message
* **event_time** - The date parsed from the message
* **grabbed_time** - The time the log was inserted into the DB

#### Performance
Intended to hold performance data as it's coming in live

Columns
* **stream** - The stream that the log came from
* **cpu** - The amount of CPU used
* **ram** - The amount of RAM used
* **event_time** - The date parsed from the message
* **grabbed_time** - The time the log was inserted into the DB'

#### Storage
Intended to hold storage data as it's coming in live

Columns
* **stream** - The stream that the log came from
* **used** - The amount of used storage
* **total** - The total amount of avaliable storage
* **event_time** - The date parsed from the message
* **grabbed_time** - The time the log was inserted into the DB'


#### Params
Hosts various parameters of the program

Columns
* **api_name** - The name used in the backend
* **display_name** - The name visible to users
* **value** - The value of the parameter
* **type** - The data type of the value
* **read_only** - Determines if a parameter can be altered in the UI.
