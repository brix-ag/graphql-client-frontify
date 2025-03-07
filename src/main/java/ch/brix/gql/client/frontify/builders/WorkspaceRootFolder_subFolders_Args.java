package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_subFolders_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `SubFolderItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public WorkspaceRootFolder_subFolders_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current `SubFolderItems` listing page number.
   * Default value: 1
   */
  public WorkspaceRootFolder_subFolders_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
