package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetLocationFolder {
  /**
   * `Folder` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Folder` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `Folder`.
   */
  @com.google.gson.annotations.SerializedName("breadcrumbs")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Breadcrumb.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Breadcrumb> breadcrumbs;
}
