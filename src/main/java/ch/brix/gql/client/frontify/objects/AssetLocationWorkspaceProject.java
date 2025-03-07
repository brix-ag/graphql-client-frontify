package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AssetLocationWorkspaceProject {
  /**
   * `WorkspaceProject` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `WorkspaceProject` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
