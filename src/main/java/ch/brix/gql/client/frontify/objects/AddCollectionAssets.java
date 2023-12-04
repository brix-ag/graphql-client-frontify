package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddCollectionAssets {
  /**
   * `Collection` details.
   */
  @com.google.gson.annotations.SerializedName("collection")
  private ch.brix.gql.client.frontify.objects.Collection collection;
}
