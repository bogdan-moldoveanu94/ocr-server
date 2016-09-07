package models.document

import models.primitives.BoundingBox

case class ParsedRow(boundingBox : Option[BoundingBox], words : List[ParsedWord]){}
