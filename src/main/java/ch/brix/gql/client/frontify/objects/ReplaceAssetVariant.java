package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ReplaceAssetVariant {
  /**
   * The newly created `AssetVariant` processing job response.
   */
  @com.google.gson.annotations.SerializedName("job")
  private ch.brix.gql.client.frontify.objects.AssetVariantProcessingJob job;
}
