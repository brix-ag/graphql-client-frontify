package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddAssetLicense {
  /**
   * `Asset` details.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
  /**
   * `License` details.
   */
  @com.google.gson.annotations.SerializedName("license")
  private ch.brix.gql.client.frontify.objects.License license;
}
