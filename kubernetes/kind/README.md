# kind

[kind](https://kind.sigs.k8s.io/) is a tool for running local Kubernetes clusters using Docker container “nodes”.
kind was primarily designed for testing Kubernetes itself, but may be used for local development or CI.

## MACOS installation in
```bash
curl https://golang.org/dl/go1.15.4.darwin-amd64.pkg && open go1.15.4.darwin-amd64.pkg
GO111MODULE="on" go get sigs.k8s.io/kind@v0.9.0 && kind create cluster
```
checking...
```
kubectl config view
kubectl get nodes
```

º
