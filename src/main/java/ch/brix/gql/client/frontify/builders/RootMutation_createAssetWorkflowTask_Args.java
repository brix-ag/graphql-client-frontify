package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAssetWorkflowTask_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreateAssetWorkflowTask` input argument.
   * Default value: null
   */
  public RootMutation_createAssetWorkflowTask_Args input(ch.brix.gql.client.frontify.input_objects.CreateAssetWorkflowTaskInput value) {
    _add_arg("input", value);
    return this;
  }
}
