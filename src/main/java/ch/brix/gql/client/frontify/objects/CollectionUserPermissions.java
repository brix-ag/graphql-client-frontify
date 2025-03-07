package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CollectionUserPermissions {
  /**
   * Check if the current user can add `Assets` in this `Collection`.
   */
  @com.google.gson.annotations.SerializedName("canAddAssets")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canAddAssets;
  /**
   * Check if the current user can remove `Assets` from this `Collection`.
   */
  @com.google.gson.annotations.SerializedName("canRemoveAssets")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canRemoveAssets;
}
