package main

import (
	"fmt"
	"time"
)

type Server struct {
	host    string
	port    int
	timeout time.Duration
	maxConn int
}

func main() {
	svr := New(
		//WithHost("localhost"),
		WithPort(8080),
		WithTimeout(time.Minute),
		WithMaxConn(120),
	)
	fmt.Println(svr.host)

}

func New(options ...func(*Server)) *Server {
	svr := &Server{}
	for _, o := range options {
		o(svr)
	}
	return svr
}

func WithHost(host string) func(*Server) {
	return func(s *Server) {
		s.host = host
	}
}

func WithPort(port int) func(*Server) {
	return func(s *Server) {
		s.port = port
	}
}

func WithTimeout(timeout time.Duration) func(*Server) {
	return func(s *Server) {
		s.timeout = timeout
	}
}

func WithMaxConn(maxConn int) func(*Server) {
	return func(s *Server) {
		s.maxConn = maxConn
	}
}

func (s *Server) Start() error {
	return fmt.Errorf("")
}
