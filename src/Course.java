//***************************************************************************************************************************************************
//
// Copyright (C) 2016 Selim Temizer.
//
// This file is part of CourseScheduler.
//
// CourseScheduler is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License
// as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
//
// CourseScheduler is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License along with CourseScheduler. If not, see <http://www.gnu.org/licenses/>.
//
//***************************************************************************************************************************************************




//***************************************************************************************************************************************************

public class Course
{
  //=================================================================================================================================================

  public int    index           ;
  public String name            ;
  public int    capacity        ;
  public int    arrangement     ;
  public int    instructorIndex ;

  //=================================================================================================================================================

  public Course ( String text )  // Example text: "1 , CENG 140 (1) , Medium , A21 , 10"
  {
    String [] parts = text.split( "," ) ;

    index           = Integer.parseInt                     ( parts[0].trim() ) ;
    name            =                                        parts[1].trim()   ;
    capacity        = SchedulingProblem.stringToCapacity   ( parts[2].trim() ) ;
    arrangement     = SchedulingProblem.stringToArrangement( parts[3].trim() ) ;
    instructorIndex = Integer.parseInt                     ( parts[4].trim() ) ;
  }

  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    return String.format( "[%d , %s , %s , %s , %d]"                            ,
                           index                                                ,
                           name                                                 ,
                           SchedulingProblem.capacityToString   ( capacity    ) ,
                           SchedulingProblem.arrangementToString( arrangement ) ,
                           instructorIndex                                      ) ;
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

