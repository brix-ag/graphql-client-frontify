package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Breadcrumb {
  /**
   * `Breadcrumb` folder id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Breadcrumb` folder name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
