package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateAsset {
  /**
   * `Asset` details.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
}
