package ch.brix.gql.client.frontify.builders;

public class RootMutation_createAssetWorkflowTask extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateAssetWorkflowTask> {
  public RootMutation_createAssetWorkflowTask() {
    super(new ch.brix.gql.client.Call<>("createAssetWorkflowTask", "CreateAssetWorkflowTask"));
  }
  public RootMutation_createAssetWorkflowTask args(RootMutation_createAssetWorkflowTask_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createAssetWorkflowTask onCreateAssetWorkflowTask(On_CreateAssetWorkflowTask typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
