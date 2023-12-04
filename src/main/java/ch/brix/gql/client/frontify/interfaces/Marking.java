package ch.brix.gql.client.frontify.interfaces;

/**
 * Interface representing a visual `Marking` (highlighted point/area) of an `Asset`.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.SimpleMarking.class, ch.brix.gql.client.frontify.objects.MultiPageMarking.class, ch.brix.gql.client.frontify.objects.VideoMarking.class})
public interface Marking {
  /**
   * The `Marking` position in percentage relative to the top left corner of the annotated subject.
   */
  ch.brix.gql.client.frontify.objects.MarkingPosition getPosition();
  /**
   * The `Marking` dimensions in percentage relative to the annotated subject size.
   */
  ch.brix.gql.client.frontify.objects.MarkingDimensions getDimensions();
}
