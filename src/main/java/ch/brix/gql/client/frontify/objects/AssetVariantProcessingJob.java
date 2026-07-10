package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetVariantProcessingJob {
  /**
   * `AssetVariant` Id.
   */
  @com.google.gson.annotations.SerializedName("variantId")
  private ch.brix.gql.client.frontify.scalars.IdScalar variantId;
}
