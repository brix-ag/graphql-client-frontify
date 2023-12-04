package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MarkingDimensions {
  /**
   * The width of the `Marking` area in percentage of the annotated subject total width, relative to the top left corner.
   */
  @com.google.gson.annotations.SerializedName("width")
  private ch.brix.gql.client.frontify.scalars.PercentScalar width;
  /**
   * The height of the `Marking` area in percentage of the annotated subject total height, relative to the top left corner.
   */
  @com.google.gson.annotations.SerializedName("height")
  private ch.brix.gql.client.frontify.scalars.PercentScalar height;
}
