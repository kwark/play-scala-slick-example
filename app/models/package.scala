import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Interval.Closed
import eu.timepit.refined.W
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.{MaxSize, NonEmpty}

package object models {

  type Age = Int Refined Closed[W.`0`.T, W.`140`.T]
  type Name = String Refined And[NonEmpty, MaxSize[W.`256`.T]]

}
