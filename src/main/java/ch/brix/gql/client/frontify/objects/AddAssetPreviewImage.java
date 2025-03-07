package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddAssetPreviewImage {
  /**
   * The newly created `Asset` preview image processing job response.
   */
  @com.google.gson.annotations.SerializedName("job")
  private ch.brix.gql.client.frontify.objects.AssetPreviewProcessingJob job;
}
