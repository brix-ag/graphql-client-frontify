package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Account implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Account` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * List and search `UserItems`.
   */
  @com.google.gson.annotations.SerializedName("users")
  private ch.brix.gql.client.frontify.objects.UserItems users;
  /**
   * List and search `UserGroupItems`.
   */
  @com.google.gson.annotations.SerializedName("userGroups")
  private ch.brix.gql.client.frontify.objects.UserGroupItems userGroups;
  /**
   * **BETA** List and search `AccountSearch` item(s).
   */
  @com.google.gson.annotations.SerializedName("search")
  private ch.brix.gql.client.frontify.objects.AccountSearchItems search;
  /**
   * **BETA** Retrieve `Catalog` list for `Account` ID.
   */
  @com.google.gson.annotations.SerializedName("catalogs")
  private ch.brix.gql.client.frontify.objects.CatalogItems catalogs;
  /**
   * **BETA** List and search `TargetItems`.
   */
  @com.google.gson.annotations.SerializedName("targets")
  private ch.brix.gql.client.frontify.objects.TargetItems targets;
}
