package ch.brix.gql.client.frontify.input_objects;

public class WorkspaceProjectQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Limit the result set based on `WorkspaceProject` state.
   */
  @ch.brix.gql.client.DefaultValue("ALL")
  public WorkspaceProjectQueryInput state(ch.brix.gql.client.frontify.enums.WorkspaceProjectStateFilter v) {
    values.put("state", v);
    return this;
  }
  /**
   * **BETA** Sort order of the `WorkspaceProject` query result set.
   */
  public WorkspaceProjectQueryInput sortBy(ch.brix.gql.client.frontify.enums.WorkspaceProjectQuerySort v) {
    values.put("sortBy", v);
    return this;
  }
}
