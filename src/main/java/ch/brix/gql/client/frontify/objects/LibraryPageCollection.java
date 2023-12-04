package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryPageCollection implements ch.brix.gql.client.frontify.interfaces.Node {
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
   * `LibraryPageCollection`'s `Asset` items list.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.AssetItems assets;
  /**
   * `LibraryPageCollection`'s privacy state setting.
   */
  @com.google.gson.annotations.SerializedName("isPrivate")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isPrivate;
}
