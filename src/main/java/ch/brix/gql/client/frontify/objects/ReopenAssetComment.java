package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ReopenAssetComment {
  /**
   * The reopened `AssetComment`.
   */
  @com.google.gson.annotations.SerializedName("comment")
  private ch.brix.gql.client.frontify.objects.AssetComment comment;
}
