package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MultiPageMarking implements ch.brix.gql.client.frontify.interfaces.Marking {
  /**
   * The `Marking` position in percent relative to the top left corner of the `Asset`.
   */
  @com.google.gson.annotations.SerializedName("position")
  private ch.brix.gql.client.frontify.objects.MarkingPosition position;
  /**
   * The `Marking` dimensions in percent of `Asset` dimensions.
   */
  @com.google.gson.annotations.SerializedName("dimensions")
  private ch.brix.gql.client.frontify.objects.MarkingDimensions dimensions;
  /**
   * The `Asset` page where the `Marking` is set.
   */
  @com.google.gson.annotations.SerializedName("page")
  private ch.brix.gql.client.frontify.scalars.IntScalar page;
}
