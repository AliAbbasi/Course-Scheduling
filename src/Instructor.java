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

import java.util.Arrays ;

//***************************************************************************************************************************************************




//***************************************************************************************************************************************************

public class Instructor
{
  //=================================================================================================================================================

  public int    index                  ;
  public String name                   ;
  public int [] unwantedSlotIndices    ;
  public int [] unpreferredSlotIndices ;

  //=================================================================================================================================================

  public Instructor ( String text )  // Example text: "28 , Selim Temizer , 4 , 5 , 10 , 13 , 34 , 4 , 3 , 23 , 37 , 42"
  {
    String [] parts = text.split( "," ) ;

    index = Integer.parseInt( parts[0].trim() ) ;
    name  =                   parts[1].trim()   ;

    int numUnwanted    = Integer.parseInt( parts[ 2               ].trim() ) ;
    int numUnpreferred = Integer.parseInt( parts[ 3 + numUnwanted ].trim() ) ;

    unwantedSlotIndices    = new int [ numUnwanted    ] ;
    unpreferredSlotIndices = new int [ numUnpreferred ] ;

    for ( int i = 0 ; i < numUnwanted    ; i++ )  { unwantedSlotIndices   [i] = Integer.parseInt( parts[ 3 +               i ].trim() ) ; }
    for ( int i = 0 ; i < numUnpreferred ; i++ )  { unpreferredSlotIndices[i] = Integer.parseInt( parts[ 4 + numUnwanted + i ].trim() ) ; }

    Arrays.sort( unwantedSlotIndices    ) ;
    Arrays.sort( unpreferredSlotIndices ) ;
  }

  //=================================================================================================================================================

  @Override
  public String toString ()
  {
    StringBuilder s = new StringBuilder() ;

    s.append( "["   ).append( index                         ) ;
    s.append( " , " ).append( name                          ) ;
    s.append( " , " ).append( unwantedSlotIndices   .length ) ;  for ( int i : unwantedSlotIndices    )  { s.append( " , " ).append( i ) ; }
    s.append( " , " ).append( unpreferredSlotIndices.length ) ;  for ( int i : unpreferredSlotIndices )  { s.append( " , " ).append( i ) ; }
    s.append( "]"   ) ;

    return s.toString() ;
  }

  //=================================================================================================================================================
}

//***************************************************************************************************************************************************

