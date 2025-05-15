package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlockReference {
  /**
   * **BETA** The id of the `GuidelinePageBlockReference`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The `GuidelinePageBlock` that this reference resolves to.
   */
  @com.google.gson.annotations.SerializedName("block")
  private ch.brix.gql.client.frontify.objects.GuidelinePageBlock block;
}
