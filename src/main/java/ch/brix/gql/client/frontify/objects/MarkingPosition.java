package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MarkingPosition {
  /**
   * The horizontal position of the `Marking` in percentage, in relation to the `Asset` total width.
   */
  @com.google.gson.annotations.SerializedName("x")
  private ch.brix.gql.client.frontify.scalars.PercentScalar x;
  /**
   * The vertical position of the `Marking` in percentage, in relation to the `Asset` total height.
   */
  @com.google.gson.annotations.SerializedName("y")
  private ch.brix.gql.client.frontify.scalars.PercentScalar y;
}
