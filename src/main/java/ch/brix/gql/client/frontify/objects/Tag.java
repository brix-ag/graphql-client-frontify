package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Tag {
  /**
   * `Tag` value.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
  /**
   * `Tag` source indicating how the tag was linked to the `Asset`. AUTO: created by AI `Asset` recognition. MANUAL: manually added.
   */
  @com.google.gson.annotations.SerializedName("source")
  private ch.brix.gql.client.frontify.enums.TagSource source;
}
