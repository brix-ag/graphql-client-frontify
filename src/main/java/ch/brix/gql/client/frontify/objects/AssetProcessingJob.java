package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetProcessingJob {
  /**
   * `Asset` Id.
   */
  @com.google.gson.annotations.SerializedName("assetId")
  private ch.brix.gql.client.frontify.scalars.IdScalar assetId;
}
