package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeWorkflowChecklistPreset_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `RemoveWorkflowChecklistPreset` input argument.
   * Default value: null
   */
  public RootMutation_removeWorkflowChecklistPreset_Args input(ch.brix.gql.client.frontify.input_objects.RemoveWorkflowChecklistPresetInput value) {
    _add_arg("input", value);
    return this;
  }
}
