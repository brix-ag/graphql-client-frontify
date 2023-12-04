package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateAssetComment {
  /**
   * `AssetComment` details.
   */
  @com.google.gson.annotations.SerializedName("comment")
  private ch.brix.gql.client.frontify.objects.AssetComment comment;
}
