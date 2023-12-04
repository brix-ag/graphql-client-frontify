package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateWorkspaceProject {
  /**
   * `WorkspaceProject` details.
   */
  @com.google.gson.annotations.SerializedName("project")
  private ch.brix.gql.client.frontify.objects.Workspace project;
}
