package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteFolders {
  /**
   * List of the deleted `Folder` ids.
   */
  @com.google.gson.annotations.SerializedName("ids")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.IdScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> ids;
}
