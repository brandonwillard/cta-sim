Simulating better bus service
=================

[<img src="https://dssg.uchicago.edu/wp-content/uploads/2015/10/cta.png" align="right" width="150">](http://www.transitchicago.com)

Big data simulation of Chicago's public transportation to improve transit planning and reduce bus crowding.

This project is a part of the 2013 [Data Science for Social Good](https://dssg.uchicago.edu) fellowship, in partnership with the [Chicago Transit Authority](http://www.transitchicago.com/).

*For a quick and gentle overview of the project, check out our [blog post](https://dssg.uchicago.edu/cta-why-bus-crowding-happens-and-how-data-can-help).*

## The problem: bus overcrowding
The Chicago Transit Authority (CTA) has made a concerted effort to decrease the crowding on public transportation that has been a 
cause for concern over the last few years. The CTA has been collecting information such as: the number of people riding a 
specific bus, the times at which more people board buses at a specific stop, and the delay times on different routes, among other
things. This data, after some processing, is used to understand and modify schedules and routes for the following quarter.

**[Read more about bus overcrowding on our blog](https://dssg.uchicago.edu/cta-why-bus-crowding-happens-and-how-data-can-help)**

## The solution: simulating Chicago's transit system
While current best practices are data-focused, they are retrospective in nature. We propose to turn scheduling into a more 
prospective exercise through statistical modeling and simulation. This will allow the planning analytics department to be more
proactive and to better understand the impact of certain scheduling decisions on bus crowding before implementation. Given the 
richness of the data available, we believe that even a simple statistical model and simulation approach will provide useful 
insight into bus de-crowding.

![web app screenshot](https://raw.github.com/dssg/dssg.github.io/master/img/posts/cta-sim-screenshot.png)

Our tool displays historical data with the metrics the CTA uses today and incorporates new metrics along with simulated
data. The new data will help the CTA have a deeper understanding of the results that arise from schedule changes. This new
understanding will help the CTA in the effort to reduce crowding on buses.

**[Read more about our methodology in the wiki](../../wiki/Models)**

## Project layout
Coming soon!

## Installation Guide 
Most of the information regarding the project idea can be found in the wiki section of the github repository at https://github.com/dssg/dssg-cta-project/wiki

## Team

**Mentor**
![Brandon](http://dssg.uchicago.edu/wp-content/uploads/2015/10/willard.jpg) 

<br>
Brandon T. Willard <br>
Faculty Research Consultant at Chicago Booth 

**Fellows**

| ![Andres](http://dssg.uchicago.edu/wp-content/uploads/2015/10/carranza.jpg) | ![Jordan](http://dssg.uchicago.edu/wp-content/uploads/2015/10/bates.jpg) | ![Walter](http://dssg.uchicago.edu/wp-content/uploads/2015/10/dempsey.jpg) |![David](http://dssg.io/img/people/sekora.jpg) |
|:---:|:---:|:---:|:---:|
| Andr&eacute;s Akle | Jordan Bates | Walter Dempsey | David Sekora |
| Applied Mathematics and Telecommunications | Applied Math for Life and Social Science | Statistics | Mathematics and Computer Science |
| Instituto Tecnol&oacute;gico Aut&oacute;nomo de M&eacute;xico | Arizona State University | University of Chicago (Hyde Park, baby!)| University of Chicago |

## Contributing to the project
To get involved, please check the [issue tracker](https://github.com/dssg/cta-sim/issues).

To get in touch, email Walter Dempsey at <dempsey.walter@gmail.com>.

## License 

Copyright (C) 2013 [Data Science for Social Good Fellowship at the University of Chicago](https://dssg.uchicago.edu)

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
