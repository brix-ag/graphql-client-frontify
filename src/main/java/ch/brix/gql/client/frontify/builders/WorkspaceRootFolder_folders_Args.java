package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_folders_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `FolderItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public WorkspaceRootFolder_folders_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current `FolderItems` listing page number.
   * Default value: 1
   */
  public WorkspaceRootFolder_folders_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
