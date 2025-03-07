package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Collection implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Collection` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Collection` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `Collection`'s `Asset` items list.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.AssetItems assets;
  /**
   * **DEPRECATED** `Collection`'s privacy state setting. This field will be removed. | Date: 2024-01-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2024-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("isPrivate")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isPrivate;
  /**
   * `Collection`'s permissions of the current `User`.
   */
  @com.google.gson.annotations.SerializedName("currentUserPermissions")
  private ch.brix.gql.client.frontify.objects.CollectionUserPermissions currentUserPermissions;
}
