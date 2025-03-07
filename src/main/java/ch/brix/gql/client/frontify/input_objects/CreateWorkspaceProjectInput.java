package ch.brix.gql.client.frontify.input_objects;

public class CreateWorkspaceProjectInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Brand` where `Project` should be inserted.
   */
  public CreateWorkspaceProjectInput brandId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("brandId", v);
    return this;
  }
  /**
   * `Workspace` type `Project` name.
   */
  public CreateWorkspaceProjectInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
