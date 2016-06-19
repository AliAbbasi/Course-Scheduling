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

public class Slot
{
  //=================================================================================================================================================

  public int    index ;
  public String day   ;
  public String hour  ;
  public int    full  ;

  //=================================================================================================================================================

  public Slot ( String text )  // Example text: "1 , Monday , 8:40"
  {
    String [] parts = text.split( "," ) ;

    index = Integer.parseInt( parts[0].trim() ) ;
    day   =                   parts[1].trim()   ;
    hour  =                   parts[2].trim()   ;
    full  =                   0                 ;
  }
    
  
  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    return String.format( "[%d , %s , %s]" , index , day , hour ) ;
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

