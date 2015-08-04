# Aspose_Slides_Java_for_Ruby
Aspose.Slides Java for Ruby is a gem that demonstrates / provides the Aspose.Slides for Java API usage examples in Ruby by using Rjb - Ruby Java Bridge.

## Installation

Execute following command.

    $ gem install asposeslidesjava

To download Aspose.Slides for Java API to be used with these examples through RJB, Please navigate to:

http://www.aspose.com/community/files/72/java-components/aspose.slides-for-java/

Note: Create jars folder at root of the gem folder and copy downloaded Aspose.Slides for java component into it.

For most complete documentation of the project, check Aspose.Slides Java for Ruby confluence wiki link:

http://www.aspose.com/docs/display/slidesjava/3.+Aspose.Slides+Java+For+Ruby

## Usage

```ruby
require File.dirname(File.dirname(File.dirname(__FILE__))) + '/lib/asposeslidesjava'
include Asposeslidesjava
include Asposeslidesjava::HelloWorld
initialize_aspose_slides
```
Lets understand the above code
* The first line makes sure that the aspose slides is loaded and available 
* Include the files that are required to access the aspose slides
* Initialize the libraries. The aspose JAVA classes are loaded from the path provided in the aspose.yml file