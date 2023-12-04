package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveAssetRelations {
  /**
   * `Asset` details.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
  /**
   * Related `Asset` items details.
   */
  @com.google.gson.annotations.SerializedName("relatedAssets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> relatedAssets;
}
