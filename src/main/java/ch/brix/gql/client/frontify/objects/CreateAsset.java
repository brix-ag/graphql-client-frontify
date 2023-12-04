package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateAsset {
  /**
   * The newly created `Asset` processing job response.
   */
  @com.google.gson.annotations.SerializedName("job")
  private ch.brix.gql.client.frontify.objects.AssetProcessingJob job;
}
